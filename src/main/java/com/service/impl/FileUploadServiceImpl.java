package com.service.impl;


import com.service.FileUploadService;
import com.utils.constants.Constants;
import com.utils.fastdfs.FileDfsUtil;
import com.utils.resultcode.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date 2021/5/9 9:46
 * @description
 */
@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    private FileDfsUtil fileDfsUtil;

    @Override
    public String uploadFile(MultipartFile uploadfile) {
        return fileDfsUtil.upload(uploadfile);
    }

    @Override
    public ResultCode uploadOneFile(MultipartFile uploadfile) {
        ResultCode resultCode = new ResultCode();
        String imageUrl = Constants.FILEURL_FIRSTNAME + fileDfsUtil.upload(uploadfile);
        Map<String, String> map = new HashMap<>();
        map.put("src", imageUrl);
        map.put("title", uploadfile.getOriginalFilename());
        resultCode.setCode(200);
        resultCode.setData(map);
        return resultCode;
    }
}
