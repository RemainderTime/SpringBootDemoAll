package com.xf._16_springboot_mybatis_generator.util.generator.config;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:49 2019/10/17
 * @description :自定义注解类
 */
public class CommentGeneratorField extends CommentGeneratorParent {

    private Properties properties;

    public CommentGeneratorField() {
        properties = new Properties();
    }

    @Override
    public void addConfigurationProperties(Properties properties) {
        // 获取自定义的 properties
        this.properties.putAll(properties);
    }

    /**
     * 自定义类注解
     * @param topLevelClass
     * @param introspectedTable
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String author = properties.getProperty("author");
        String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd HH:mm");
        SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        // 获取表注释
        String remarks = introspectedTable.getRemarks();

        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * @author " + author);
        topLevelClass.addJavaDocLine(" * @date " + dateFormatter.format(new Date()));
        topLevelClass.addJavaDocLine(" * @description :"+ remarks);
        topLevelClass.addJavaDocLine(" */");
    }

    /**
     * 自定义实体类注解
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列注释
        String remarks = introspectedColumn.getRemarks();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + remarks);
        field.addJavaDocLine(" */");
    }

    /**
     * 自定义方法注解
     * @param method
     * @param introspectedTable
     */
    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * " );
        method.addJavaDocLine(" */");
    }

    /**
     * 自定义实体类get方法注解
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列注释
        String remarks = introspectedColumn.getRemarks();
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * @return 获取" + remarks);
        method.addJavaDocLine(" */");
    }

    /**
     * 自定义实体类set方法注解
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 获取列注释
        String remarks = introspectedColumn.getRemarks();
        // 获取类字段名称
        String name = introspectedColumn.getJavaProperty();
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * 设置"+remarks);
        method.addJavaDocLine(" * @" + name);
        method.addJavaDocLine(" */");
    }
}
