/**
 * 
 */
package com.cs.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.cs.dao.model.CollectPO;
import com.cs.web.model.vo.CollectShowVO;

/**
 * @author ZST
 *
 */
public interface CollectMapper extends BaseMapper {

	public int insertCollect(CollectPO collect);
	
	public Integer getCollectId(int person, int activity);
	
	public List<CollectShowVO> getCollects(HashMap<String , Integer> condition);
	
	public int delCollect(int person, int activity);
}
