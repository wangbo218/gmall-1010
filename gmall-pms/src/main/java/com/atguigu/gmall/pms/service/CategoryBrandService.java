package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author bro
 * @email wb960228@163.com
 * @date 2022-10-11 19:56:43
 */
public interface CategoryBrandService extends IService<CategoryBrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

