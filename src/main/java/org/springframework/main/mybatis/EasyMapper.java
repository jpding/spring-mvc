package org.springframework.main.mybatis;

import org.springframework.stereotype.Service;

@Service("easyMapper")
public interface EasyMapper {
	public Easy getById(int id);
}
