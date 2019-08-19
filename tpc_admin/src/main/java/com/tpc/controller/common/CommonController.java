package com.tpc.controller.common;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
* 通用请求处理
* @author TPC
* $data 2019-08-19 23:49
*/
@Controller
public class CommonController {

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String Login(){
//        resultUtil.setDatas(userNameDto);
//        System.out.println(userNameDto.toString());
//        List<TpcUser> userNameDto1 = userSerivce.getUserList(Long.parseLong("0"));
//        System.out.println(userNameDto1.toString());
        return "userNameDto";
    }

//    private static final Logger log = LoggerFactory.getLogger(CommonController.class);
//
//    @Autowired
//    private ServerConfig serverConfig;
//
//    /**
//     * 通用下载请求
//     *
//     * @param fileName 文件名称
//     * @param delete 是否删除
//     */
//    @GetMapping("common/download")
//    public void fileDownload(String fileName, Boolean delete, HttpServletResponse response, HttpServletRequest request)
//    {
//        try
//        {
//            if (!FileUtils.isValidFilename(fileName))
//            {
//                throw new Exception(StringUtils.format("文件名称({})非法，不允许下载。 ", fileName));
//            }
//            String realFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("_") + 1);
//            String filePath = Global.getDownloadPath() + fileName;
//
//            response.setCharacterEncoding("utf-8");
//            response.setContentType("multipart/form-data");
//            response.setHeader("Content-Disposition",
//                    "attachment;fileName=" + FileUtils.setFileDownloadHeader(request, realFileName));
//            FileUtils.writeBytes(filePath, response.getOutputStream());
//            if (delete)
//            {
//                FileUtils.deleteFile(filePath);
//            }
//        }
//        catch (Exception e)
//        {
//            log.error("下载文件失败", e);
//        }
//    }
//
//    /**
//     * 通用上传请求
//     */
//    @PostMapping("/common/upload")
//    @ResponseBody
//    public AjaxResult uploadFile(MultipartFile file) throws Exception
//    {
//        try
//        {
//            // 上传文件路径
//            String filePath = Global.getUploadPath();
//            // 上传并返回新文件名称
//            String fileName = FileUploadUtils.upload(filePath, file);
//            String url = serverConfig.getUrl() + fileName;
//            AjaxResult ajax = AjaxResult.success();
//            ajax.put("fileName", fileName);
//            ajax.put("url", url);
//            return ajax;
//        }
//        catch (Exception e)
//        {
//            return AjaxResult.error(e.getMessage());
//        }
//    }
}
