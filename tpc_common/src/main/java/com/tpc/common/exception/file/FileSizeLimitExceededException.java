package com.tpc.common.exception.file;

/**
* 文件名大小限制异常类
* @author TPC
* $data 2019-08-20 22:48
*/
public class FileSizeLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
