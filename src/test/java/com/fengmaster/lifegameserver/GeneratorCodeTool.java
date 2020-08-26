package com.fengmaster.lifegameserver;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.IFileCreate;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.FileType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * mybatis-plus 代码生成工具
 */
public class GeneratorCodeTool {


    /**
     * 包名
     */
    private static final String PACKAGE_NAME = "com.fengmaster.lifegameserver";

    /**
     * 输出文件的路径
     */
    private static final String JAVA_OUT_PATH = "/home/fengmaster/IdeaProjects/lifegameserver/src/main/java/";
    /**
     * 输出文件的路径
     */
    private static final String XML_OUT_PATH = "/home/fengmaster/IdeaProjects/lifegameserver/src/main/resources/mapper/";
    /**
     * 代码生成者
     */
    private static final String AUTHOR = "ln";

    private static final String[] INCLUDE_TABLE = new String[] {};
    private static final String[] EXCLUDE_TABLE = new String[] {};

    /**
     * JDBC相关配置
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://10.19.6.25:3306/lavagna?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    private static final String USER_NAME = "lavagna";
    private static final String PASSWORD = "Caih!@34";
    private static final DbType DBTYPE = DbType.MYSQL;

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        // 自定义需要填充的字段
        List<TableFill> tableFillList = new ArrayList<TableFill>();
        //如 每张表都有一个创建时间、修改时间
        //而且这基本上就是通用的了，新增时，创建时间和修改时间同时修改
        //修改时，修改时间会修改，
        //虽然像Mysql数据库有自动更新几只，但像ORACLE的数据库就没有了，
        //使用公共字段填充功能，就可以实现，自动按场景更新了。
        //如下是配置
        TableFill createField = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill modifiedField = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        tableFillList.add(createField);
        tableFillList.add(modifiedField);

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir(JAVA_OUT_PATH)// 输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(true)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(false)// XML ResultMap
                        .setBaseColumnList(false)// XML columList
                        // .setSwagger2(true)// 添加实体属性 Swagger2 注解
                        .setAuthor(AUTHOR)
                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
                        .setXmlName("%sMapper")
                        .setMapperName("%sMapper")
                // .setServiceName("MP%sService")
                // .setServiceImplName("%sServiceDiy")
                // .setControllerName("%sAction")
                ).setDataSource(
                        // 数据源配置
                        new DataSourceConfig()
                                .setDbType(DBTYPE)// 数据库类型
                                .setTypeConvert(new MySqlTypeConvert() {
                                    // 自定义数据库表字段类型转换【可选】
                                    @Override
                                    public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                                        // System.out.println("转换类型：" + fieldType);
                                        // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                                        // return DbColumnType.BOOLEAN;
                                        // }
                                        return super.processTypeConvert(globalConfig, fieldType);
                                    }
                                })
                                .setDriverName(DRIVER)
                                .setUsername(USER_NAME)
                                .setPassword(PASSWORD)
                                .setUrl(URL)
                ).setStrategy(
                        // 策略配置
                        new StrategyConfig()
                                // .setCapitalMode(true)// 全局大写命名
                                // .setDbColumnUnderline(true)// 全局下划线命名
                                // .setTablePrefix(new String[]{"unionpay_"})// 此处可以修改为您的表前缀
                                .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                                 .setInclude(INCLUDE_TABLE) // 需要生成的表，注掉则是全部表
                                 .setExclude(EXCLUDE_TABLE) // 排除生成的表
                                // 自定义实体，公共字段
                                // .setSuperEntityColumns(new String[]{"test_id"})
                                .setTableFillList(tableFillList)
                                // 自定义实体父类
                                // .setSuperEntityClass("com.baomidou.demo.base.BsBaseEntity")
                                // // 自定义 mapper 父类
                                // .setSuperMapperClass("com.baomidou.demo.base.BsBaseMapper")
                                // // 自定义 service 父类
                                // .setSuperServiceClass("com.baomidou.demo.base.BsBaseService")
                                // // 自定义 service 实现类父类
                                // .setSuperServiceImplClass("com.baomidou.demo.base.BsBaseServiceImpl")
                                // 自定义 controller 父类
                                // .setSuperControllerClass("com.baomidou.demo.TestController")
                                // 【实体】是否生成字段常量（默认 false）
                                 .setEntityColumnConstant(true)
                                // 【实体】是否为构建者模型（默认 false）
                                // public User setName(String name) {this.name = name; return this;}
                                // .setEntityBuilderModel(true)
                                // 【实体】是否为lombok模型（默认 false）
                                .setEntityLombokModel(true)
                                // Boolean类型字段是否移除is前缀处理
                                 .setEntityBooleanColumnRemoveIsPrefix(true)
                                // .setRestControllerStyle(true)
                                // .setControllerMappingHyphenStyle(true)
                ).setPackageInfo(
                        // 包配置
                        new PackageConfig()
//                                .setModuleName(MODULE_NAME)
                                .setParent(PACKAGE_NAME)// 自定义包路径
//                                .setController("controller")// 这里是控制器包名，默认 web
                                .setXml("mapper")
                                .setMapper("mapper")

                ).setCfg(
                        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                        new InjectionConfig() {
                            @Override
                            public void initMap() {
                                Map<String, Object> map = new HashMap<>();
                                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                                this.setMap(map);
                            }
                        }.setFileCreate(new IFileCreate() {
                            @Override
                            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                                // 只需生成 entity 和 mapper.xml 和 mapper.java
                                if (filePath.endsWith("Mapper.xml")||FileType.ENTITY==fileType || FileType.MAPPER == fileType){
                                    return true;
                                }else {
                                    return false;
                                }
                            }
                        })
                        .setFileOutConfigList(
                                Collections.singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
                                    // 自定义输出文件目录
                                    @Override
                                    public String outputFile(TableInfo tableInfo) {
                                        return XML_OUT_PATH + tableInfo.getEntityName() + "Mapper.xml";
                                    }
                                })))
                        .setTemplate(
                            // 关闭默认 xml 生成，调整生成 至 根目录
                            new TemplateConfig().setXml(null)
                            // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                            // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                            // .setController("...");
                            // .setEntity("...");
                             .setMapper("template/mapper.java.vm")
//                             .setXml("templates/mapper.xml.vm")
                            // .setService("...");
                            // .setServiceImpl("...");
                        );
        // 执行生成
        mpg.execute();
    }
}
