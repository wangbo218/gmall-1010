package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bro
 * @email wb960228@163.com
 * @date 2022-10-11 19:56:43
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
