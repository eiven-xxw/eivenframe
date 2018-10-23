package com.eiven.admin.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: eiven
 * @Date: Created in 9:38 2018/10/9
 */
@Data
public class TreeNode {
    protected int id;
    protected int parentId;
    protected List<TreeNode> children = new ArrayList<TreeNode>();

    public void add(TreeNode node) {
        children.add(node);
    }
}
