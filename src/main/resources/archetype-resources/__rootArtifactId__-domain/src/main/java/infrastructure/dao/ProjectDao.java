/**
 * <p>Copyright ® 迷彩CMS平台版权所有。</p>
 * 类名: ProjectDao
 * 创建人: zhaoxg    创建时间: 2015年7月15日
 */

package ${package}.infrastructure.dao;

import java.util.List;
import java.util.Map;

import ${package}.domain.po.ProjectPO;
import org.springframework.stereotype.Repository;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

/**
 * 项目Dao <br/>
 * @author zhaoxg
 */
@Repository
public interface ProjectDao {


    /**
     * 
     * 新增记录
     * @param po
     * @return
     */
    public int insertProject(ProjectPO po);
    /**
     * 
     * 更新记录
     * @param po
     * @return
     */
    public int updateProjectById(ProjectPO po);
   
    /**
     * 
     * 查询列表
     * @param po
     * @return
     */
    public List<ProjectPO> selectProject(Map map,PageBounds pageBounds);
    
    /**
     * 
     * 根据ID获取一个对象
     * @param po
     * @return
     */
    public ProjectPO selectProjectById(String id);
    
    /**
     * 
     * 根据ID删除记录
     * @param id
     * @return
     */
    public int deleteProjectById(String id);
    
    /**
     * 
     * 查询对象列表 <br/>
     * @return
     */
    public ProjectPO selectObject();
}
