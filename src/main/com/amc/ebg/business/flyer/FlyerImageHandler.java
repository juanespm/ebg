package com.amc.ebg.business.flyer;


import java.awt.Dimension;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.amc.ebg.domain.types.ImageSize;
import com.amc.ebg.util.ImageUtils;

/**
 * Images file structure:
 * 
 * <pre>
 *  ACCOUNT_ID/WEEK_NO/FLYER_ID/[0..n]_[default/small/large].extension[jpg/png]
 * </pre>
 * 
 * @author Timoteo Ponce
 */
public class FlyerImageHandler {
    public static final String NAME = "flyerImageHandler";

    public static final String TMP_PATH = "tmp/";

    private static final Logger LOG = LoggerFactory.getLogger(FlyerImageHandler.class);

    private static final Dimension DIMENSION_SMALL = new Dimension(420, 320);

    private static final Dimension DIMENSION_DEFAULT = new Dimension(640, 480);

    private static final Dimension DIMENSION_LARGE = DIMENSION_DEFAULT;

    public FlyerImage persistTemporal(final String filename, final byte[] imageData) {
        File tempFile = new File(getRootTmpPath() + System.currentTimeMillis() + "." + FilenameUtils.getExtension(filename));
        FlyerImage flyerImage = FlyerImage.NULL;
        try {
            copy(new ByteArrayInputStream(imageData), tempFile);
            String inputFile = tempFile.getName();
            LOG.info("Temp-image saved [ " + inputFile + " ]");
            flyerImage = FlyerImage.of(inputFile, inputFile);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
        return flyerImage;
    }

    public static String getRootPath() {
        return System.getProperty("jboss.server.data.dir") + "/flyer-imgs/";
    }

    public static String getRootTmpPath() {
        return getRootPath() + TMP_PATH;
    }

    private void copy(final InputStream inputStream, final File file) throws IOException {
        OutputStream outputStream = null;
        try {
            FileUtils.forceMkdir(file.getParentFile());
            if (!file.exists()) {
                file.createNewFile();
            }
            outputStream = new FileOutputStream(file);
            IOUtils.copy(inputStream, outputStream);
        } finally {
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(inputStream);
        }
    }

//    public FlyerImage persist(final Account account, final Flyer flyer, final FlyerImage image) {
//        String outputPath = getOutputAbsolutePath(account, flyer);
//        String tempFile = getRootTmpPath() + image.getLocalFile();
//        FlyerImage flyerImage = FlyerImage.NULL;
//        try {
//            ImageUtils utils = new ImageUtils();
//            utils.resize(tempFile, getOutputFile(outputPath, ImageSize.SMALL, image), DIMENSION_SMALL);
//            utils.resize(tempFile, getOutputFile(outputPath, ImageSize.DEFAULT, image), DIMENSION_DEFAULT);
//            utils.resize(tempFile, getOutputFile(outputPath, ImageSize.LARGE, image), DIMENSION_LARGE);
//            flyerImage = FlyerImage.ofPath(image.getInputFile(), getOutputRelativePath(account, flyer));
//        } catch (Exception e) {
//            LOG.error(e.getMessage(), e);
//        }
//        return flyerImage;
//    }

    private String getOutputFile(final String outputPath, final ImageSize imageSize, final FlyerImage image) {
        return outputPath + imageSize.name().toLowerCase() + ".jpg";// +
        // FilenameUtils.getExtension(image.getInputFile());
    }

//    private String getOutputAbsolutePath(final Account account, final Flyer flyer) {
//        return getRootPath() + getOutputRelativePath(account, flyer);
//    }
//
//    private String getOutputRelativePath(final Account account, final Flyer flyer) {
//        return account.getId() + "/" + new DateTime().getWeekOfWeekyear() + "/" + flyer.getId() + "/";
//    }

    /**
     * Validates if an file present in the TEMP folder has a valid size.
     * 
     * <pre>
     * valid size: >= 640x480
     * </pre>
     * 
     * @param filename
     * @return
     * @author Timoteo Ponce
     */
    public boolean hasValidSize(final String filename) {
        try {
            ImageUtils imageUtils = new ImageUtils();
            String localFile = getRootTmpPath() + "/" + filename;
            if (imageUtils.isAnImage(localFile)) {
                Dimension dimension = imageUtils.getDimension(localFile);
                return dimension.width >= 640 && dimension.height >= 480;
            }
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
        return false;
    }

}
