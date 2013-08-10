package com.amc.ebg.util;

import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.imgscalr.Scalr;
import org.slf4j.LoggerFactory;

/**
 * @author Timoteo Ponce
 */
public class ImageUtils {

    public synchronized Dimension getDimension(final String filename) throws IOException {
        BufferedImage bimg = ImageIO.read(new File(filename));
        int width = bimg.getWidth();
        int height = bimg.getHeight();
        return new Dimension(width, height);
    }

    public synchronized void resize(final String inputFile, final String outputFile, final Dimension dimension) throws ImagingOpException, IOException {
        String extension = FilenameUtils.getExtension(inputFile);
        if (extension == null) {
            throw new IllegalArgumentException("InputFile requires an extension: " + extension);
        }
        LoggerFactory.getLogger(getClass()).debug("Resizing image: " + inputFile);
        BufferedImage image1 = Scalr.resize(ImageIO.read(new File(inputFile)), dimension.width, dimension.height);

        File targetFile = new File(outputFile);
        if (!targetFile.exists()) {
            targetFile.getParentFile().mkdirs();
            targetFile.createNewFile();
        }
        ImageIO.write(image1, extension, targetFile);
    }

    public static void main(final String[] args) throws IOException {
        String folder = "/opt/swissbytes/android/androidFlyerServer/src/test/resources/img/";
        ImageUtils utils = new ImageUtils();
        utils.resize(folder + "image_orig.jpg", folder + "image_default.jpg", new Dimension(640, 480));
        utils.resize(folder + "image_orig.jpg", folder + "image_small.jpg", new Dimension(420, 320));
        utils.resize(folder + "image_orig.jpg", folder + "image_small2.jpg", new Dimension(320, 240));
        utils.resize(folder + "image_orig.jpg", folder + "image_large.jpg", new Dimension(640, 480));
        utils.resize(folder + "image_orig.jpg", folder + "image_invalid.jpg", new Dimension(200, 200));
        System.out.println(utils.getDimension(folder + "image_orig.jpg"));
        System.out.println(utils.getDimension(folder + "image_default.jpg"));
        System.out.println(utils.getDimension(folder + "image_small.jpg"));
        System.out.println(utils.getDimension(folder + "image_small2.jpg"));
        System.out.println(utils.getDimension(folder + "image_large.jpg"));
    }

    public boolean isAnImage(final String filename) {
        File file = new File(filename);
        String mimetype = new MimetypesFileTypeMap().getContentType(file);
        String type = mimetype.split("/")[0];
        return type.equals("image");
    }

}
