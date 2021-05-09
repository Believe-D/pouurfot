package com.service;

import com.utils.resultcode.ResultCode;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author
 * @date 2021/5/9 9:46
 * @description
 */
public interface FileUploadService {
    String uploadFile(MultipartFile uploadfile);

    ResultCode uploadOneFile(MultipartFile uploadfile);
}
