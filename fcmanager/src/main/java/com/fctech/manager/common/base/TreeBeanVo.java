package com.fctech.manager.common.base;

import java.util.ArrayList;
import java.util.List;



/**
 * 树形控件对应后台实体类
 *
 * 
 */
public class TreeBeanVo {
    private String id; // 树形节点ID
    private String text; // 树形节点文本
    private String state; // 节点是否展开
    private boolean checked = false; // 节点是否选中
    private boolean readonly = false; // 该节点是否只读，即不可改变勾选状态
    
    private Attributes attributes;
    
    private List<TreeBeanVo> children = new ArrayList<TreeBeanVo>(); // 子节点


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public boolean isChecked() {
        return checked;
    }


    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    
    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }


    public List<TreeBeanVo> getChildren() {
        return children;
    }


    public void setChildren(List<TreeBeanVo> children) {
        this.children = children;
    }


    public boolean isReadonly() {
        return readonly;
    }


    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }
}
