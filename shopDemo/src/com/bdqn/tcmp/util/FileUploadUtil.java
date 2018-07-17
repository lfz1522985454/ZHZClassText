package com.bdqn.tcmp.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

    public static final String[] FILE_TYPES = {"JPG", "jpg", "PNG", "png", "jpeg", "JPEG", "gif", "GIF", "bmp", "BMP","docx","doc"};

    public static final Integer FILE_SIZE = 5120 * 1024;

    public static String fileUpload(MultipartFile uploadFile, HttpSession session) {
        String fileName = null;
        try {
            // 获取文件上传路径
            // String realPath =
            // session.getServletContext().getRealPath("static" + File.separator
            // + "upload");
            String realPath = session.getServletContext().getRealPath("upload");
            // 获取文件的后缀名
            String suffixName = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
            // 判断文件是否为空
            if (!uploadFile.isEmpty()) {
                // 判断文件大小
                if (uploadFile.getSize() <= FILE_SIZE) {
                    // 判断文件类型
                    if (Arrays.asList(FILE_TYPES).contains(suffixName)) {
                        fileName = UUID.randomUUID() + "." + suffixName;
                        File file = new File(realPath, fileName);
                        uploadFile.transferTo(file);
                    }
                }
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
