package ${packageName};

import java.util.List;

/**
 *  @author ${author}
 */
public class ${className} {
<#list attrs as attr>

    /**
     *  层级：${attr.level}
     *  ${attr.remark}
     *  必填：${attr.required}
     *  ${attr.detail}
    */
    private ${attr.type} ${attr.name};
</#list>

<#--<#list attrs as attr>-->
<#--    public void set${attr.name?cap_first}(${attr.type} ${attr.name}){-->
<#--    this.${attr.name} = ${attr.name};-->
<#--    }-->
<#--    public ${attr.type} get${attr.name?cap_first}(){-->
<#--    return this.${attr.name};-->
<#--    }-->

<#--</#list>-->
}