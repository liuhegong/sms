package cn.edu.buaa.sms.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import cn.edu.buaa.sms.core.node.ZTreeNode;
import cn.edu.buaa.sms.modular.system.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角色相关业务
 *
 */
public interface IRoleService extends IService<Role> {

    /**
     * 设置某个角色的权限
     *
     * @param roleId 角色id
     * @param ids    权限的id
     */
    void setAuthority(Integer roleId, String ids);

    /**
     * 删除角色
     *
     */
    void delRoleById(Integer roleId);

    /**
     * 根据条件查询角色列表
     */
    List<Map<String, Object>> selectRoles(@Param("condition") String condition);

    /**
     * 删除某个角色的所有权限
     *
     * @param roleId 角色id
     */
    int deleteRolesById(@Param("roleId") Integer roleId);

    /**
     * 获取角色列表树
     *
     */
    List<ZTreeNode> roleTreeList();

    /**
     * 获取角色列表树
     *
     */
    List<ZTreeNode> roleTreeListByRoleId(String[] roleId);
}
