package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理的service
 * @author T-JL
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper mapper;
	
	/**
	 * 根据商品id查询商品
	 */
	@Override
	public TbItem getItemById(Long id) {
		
		TbItem tbItem = mapper.selectByPrimaryKey(id);

		return tbItem;
	}

}
