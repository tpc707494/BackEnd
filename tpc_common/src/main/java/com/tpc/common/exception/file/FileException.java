package com.tpc.common.exception.file;

import com.tpc.common.exception.base.BaseException;
/**
* 文件信息异常类
* @author TPC
* $data 2019-08-20 22:55
*/
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
