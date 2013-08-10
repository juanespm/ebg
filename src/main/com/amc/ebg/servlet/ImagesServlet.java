package com.amc.ebg.servlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amc.ebg.business.flyer.FlyerImageHandler;
import com.amc.ebg.domain.types.ImageSize;

/**
 * @author Timoteo Ponce
 */
public class ImagesServlet extends HttpServlet {

    private static final String RESOURCE_ID = "id";

    private static final String TYPE = "type";

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private static Logger LOG = LoggerFactory.getLogger(ImagesServlet.class);

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        FileInputStream in = null;
        OutputStream out = null;
        try {
            final String type = request.getParameter(TYPE);
            final String id = request.getParameter(RESOURCE_ID);
            // Get the absolute path of the image
            String imagePath = loadFromDirectoryByApp(id, type);
            if (imagePath == null) {
                imagePath = "/flyserver/view/img/error.gif";
            }
            LOG.debug("File to load as stream :" + imagePath);
            URL url = new URL("file:///" + imagePath);
            ServletContext sc = getServletContext();
            // Get the MIME type of the image
            String mimeType = sc.getMimeType(imagePath);
            if (mimeType == null) {
                sc.log("Could not get MIME type of " + imagePath);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            } else {
                // Set content type
                response.setContentType(mimeType);
                // Set content size
                File file = new File(url.toURI());
                response.setContentLength((int) file.length());
                // Open the file and output streams
                in = new FileInputStream(file);
                out = response.getOutputStream();
                // Copy the contents of the file to the output stream
                IOUtils.copy(in, out);
            }
        } catch (URISyntaxException e) {
            LOG.error(e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
    }

    private String loadFromDirectoryByApp(final String resourceId, final String type) {
        StringBuilder buffer = new StringBuilder(FlyerImageHandler.getRootPath());
        if (type.equals("tmp")) {
            buffer.append(FlyerImageHandler.TMP_PATH);
            buffer.append(resourceId);
        }else {
            ImageSize size = ImageSize.valueOf(type.toUpperCase());
            buffer.append(resourceId);
            buffer.append(size.name().toLowerCase() + ".jpg");
        }
        LOG.trace("Serving image file: " + buffer.toString());
        File result = new File(buffer.toString());
        return result.exists() ? buffer.toString() : null;
    }
}
