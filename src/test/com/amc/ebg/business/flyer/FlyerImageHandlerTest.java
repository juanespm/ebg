package com.amc.ebg.business.flyer;

import static org.testng.Assert.*;
import ch.swissbytes.commons.io.ResourceLocator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amc.ebg.business.flyer.FlyerImage;
import com.amc.ebg.business.flyer.FlyerImageHandler;

/**
 * @author Timoteo Ponce
 */
public class FlyerImageHandlerTest {

    private FlyerImageHandler imageHandler = new FlyerImageHandler();

    private final String dataDir = System.getProperty("user.home") + "/.tmp";

    @BeforeClass
    public void beforeClass() throws IOException {
        System.setProperty("jboss.server.data.dir", dataDir);
        FileUtils.copyFile(new File(ResourceLocator.getResource("resources/img/image_orig.jpg").getFile()), new File(FlyerImageHandler.getRootTmpPath() + "image_orig.jpg"));
        FileUtils.copyFile(new File(ResourceLocator.getResource("resources/img/image_invalid.jpg").getFile()), new File(FlyerImageHandler.getRootTmpPath() + "image_invalid.jpg"));
    }

    @Test
    public void testPersistTemporal() throws FileNotFoundException, IOException {
        byte[] array = IOUtils.toByteArray(ResourceLocator.getResourceAsStream("resources/img/image_orig.jpg"));
        FlyerImage image = imageHandler.persistTemporal("filename.jpg", array);
        assertTrue(new File(FlyerImageHandler.getRootTmpPath() + image.getLocalFile()).exists());
    }

    @Test
    public void testPersistImage() throws FileNotFoundException, IOException {
        byte[] array = IOUtils.toByteArray(ResourceLocator.getResourceAsStream("resources/img/image_orig.jpg"));
        FlyerImage tempImage = imageHandler.persistTemporal("filename.jpg", array);
//        Account account = new Account();
//        Flyer flyer = new Flyer();
//        account.setId(1L);
//        flyer.setId(1L);
//        FlyerImage image = imageHandler.persist(account, flyer, tempImage);
//        assertTrue(new File(FlyerImageHandler.getRootPath() + image.getDefaultFile()).exists());
//        assertTrue(new File(FlyerImageHandler.getRootPath() + image.getSmallFile()).exists());
//        assertTrue(new File(FlyerImageHandler.getRootPath() + image.getLargeFile()).exists());
    }

    @Test
    public void testValidateImageSize() {
        assertTrue(imageHandler.hasValidSize("image_orig.jpg"));
    }

    @Test
    public void testValidateInvalidImageSize() {
        assertFalse(imageHandler.hasValidSize("image_invalid.jpg"));
    }
}
