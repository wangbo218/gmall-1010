package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author bro
 * @email wb960228@163.com
 * @date 2022-10-11 19:56:43
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

