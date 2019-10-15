package com.appdemos.films.mappers;

import org.apache.ibatis.annotations.Select;

import com.appdemos.films.entity.CelebrityInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface CelebrityinfoMapper extends BaseMapper<CelebrityInfo> {
	@Select("<script> select count(1) from celebrity_info <where>"
			+"<if test='cname != null'>"
			+" cname = #{cname}"
			+"</if></where></script>")
	public int getTotal(CelebrityInfo info);
}
