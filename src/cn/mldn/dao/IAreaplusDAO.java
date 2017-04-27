package cn.mldn.dao;

import java.sql.SQLException;
import java.util.List;

import cn.mldn.util.dao.IBaseDAO;
import cn.mldn.vo.Areaplus;

public interface IAreaplusDAO extends IBaseDAO<Integer, Areaplus> {
	/**
	 * 通过省份编号找到与之对应 的所有城市信息
	 * @param aid
	 * @return
	 * @throws SQLException
	 */
	public List<Areaplus> findAllByArea(int aid) throws SQLException ;
}
