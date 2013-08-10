package com.amc.ebg.business.flyer;

import com.amc.ebg.domain.types.ImageSize;

/**
 * @author Timoteo Ponce
 */
public class FlyerImage {

    public static final FlyerImage NULL = FlyerImage.of("", "");

    private final String inputFile;

    private final String localFile;

    private final String localPath;

    public FlyerImage(final String inputFile, final String localFile, final String localPath) {
        this.inputFile = inputFile;
        this.localFile = localFile;
        this.localPath = localPath;
    }

    public String getLocalPath() {
        return localPath;
    }

    public String getLocalFile() {
        return localFile;
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getSmallFile() {
        return localPath + ImageSize.SMALL.name().toLowerCase() + ".jpg";
    }

    public String getDefaultFile() {
        return localPath + ImageSize.DEFAULT.name().toLowerCase() + ".jpg";
    }

    public String getLargeFile() {
        return localPath + ImageSize.LARGE.name().toLowerCase() + ".jpg";
    }

    public static FlyerImage of(final String inputFile, final String localFile) {
        return new FlyerImage(inputFile, localFile, "");
    }

    public static FlyerImage ofPath(final String inputFile, final String localPath) {
        return new FlyerImage(inputFile, "", localPath);
    }

}
