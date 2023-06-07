/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-17 14:47:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.business.rent;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rentCarManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

    String path = request.getContextPath();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>出租管理</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta http-equiv=\"Access-Control-Allow-Origin\" content=\"*\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/static/layui/css/layui.css\" media=\"all\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/static/css/public.css\" media=\"all\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\r\n");
      out.write("<!-- 搜索条件开始 -->\r\n");
      out.write("<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 20px;\">\r\n");
      out.write("    <legend>查询条件</legend>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("<form class=\"layui-form\" method=\"post\" id=\"searchFrm\">\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <div class=\"layui-inline\">\r\n");
      out.write("            <label class=\"layui-form-label\">身份证号:</label>\r\n");
      out.write("            <div class=\"layui-input-inline\" style=\"padding: 5px\">\r\n");
      out.write("                <input type=\"text\" name=\"identity\" id=\"identity\" autocomplete=\"off\"\r\n");
      out.write("                       class=\"layui-input layui-input-inline\"\r\n");
      out.write("                       placeholder=\"请输入身份证号\" style=\"height: 30px;border-radius: 10px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"button\"\r\n");
      out.write("                    class=\"layui-btn layui-btn-normal layui-icon layui-icon-search layui-btn-radius layui-btn-sm\"\r\n");
      out.write("                    id=\"doSearch\" style=\"margin-top: 4px\">查询\r\n");
      out.write("            </button>\r\n");
      out.write("            <button type=\"reset\"\r\n");
      out.write("                    class=\"layui-btn layui-btn-warm layui-icon layui-icon-refresh layui-btn-radius layui-btn-sm\"\r\n");
      out.write("                    style=\"margin-top: 4px\">重置\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!-- 数据表格开始 -->\r\n");
      out.write("<div id=\"content\" style=\"display: none;\">\r\n");
      out.write("    <table id=\"carTable\" lay-filter=\"carTable\"></table>\r\n");
      out.write("    <div id=\"carBar\" style=\"display: none;\">\r\n");
      out.write("        <a class=\"layui-btn layui-btn-warm layui-btn-xs layui-btn-radius\" lay-event=\"rentCar\">出租汽车</a>\r\n");
      out.write("        <a class=\"layui-btn layui-btn-xs layui-btn-radius\" lay-event=\"viewImage\">查看车辆大图</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"display: none;padding: 20px;\" id=\"saveOrUpdateDiv\">\r\n");
      out.write("    <form class=\"layui-form\" lay-filter=\"dataFrm\" id=\"dataFrm\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <label class=\"layui-form-label\">出租单号:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <input type=\"text\" name=\"rentid\" lay-verify=\"required\" readonly=\"readonly\" placeholder=\"请输入出租单号\"\r\n");
      out.write("                       class=\"layui-input\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">起租时间:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"begindate\" id=\"begindate\" lay-verify=\"required\" placeholder=\"请输入起租时间\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">还车时间:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"returndate\" id=\"returndate\" lay-verify=\"required\" placeholder=\"请输入还车时间\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">身份证号:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"identity\" lay-verify=\"required\" readonly=\"readonly\" placeholder=\"请输入身份证号\"\r\n");
      out.write("                           class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">车牌号:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"carnumber\" lay-verify=\"required\" readonly=\"readonly\"  placeholder=\"请输入车牌号\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">出租价格:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"price\" lay-verify=\"required\" placeholder=\"请输入出租价格\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">操作员:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                    <input type=\"text\" name=\"opername\" id=\"opername\" lay-verify=\"required\" placeholder=\"请输入操作员\" readonly=\"readonly\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-input-block\" style=\"text-align: center;padding-right: 120px\">\r\n");
      out.write("                <button type=\"button\"\r\n");
      out.write("                        class=\"layui-btn layui-btn-normal layui-btn-md layui-icon layui-icon-release layui-btn-radius\"\r\n");
      out.write("                        lay-filter=\"doSubmit\" lay-submit=\"\">提交\r\n");
      out.write("                </button>\r\n");
      out.write("                <button type=\"reset\"\r\n");
      out.write("                        class=\"layui-btn layui-btn-warm layui-btn-md layui-icon layui-icon-refresh layui-btn-radius\">重置\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"viewCarImageDiv\" style=\"display: none;text-align: center\">\r\n");
      out.write("    <img alt=\"出租图片\" id=\"view_carimg\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/static/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var tableIns;\r\n");
      out.write("    layui.use(['jquery', 'layer', 'form', 'table', 'laydate'], function () {\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        var table = layui.table;\r\n");
      out.write("        var dtree = layui.dtree;\r\n");
      out.write("        var laydate = layui.laydate;\r\n");
      out.write("\r\n");
      out.write("        laydate.render({\r\n");
      out.write("            elem:'#begindate',\r\n");
      out.write("            type:'datetime'\r\n");
      out.write("        });\r\n");
      out.write("        laydate.render({\r\n");
      out.write("            elem:'#returndate',\r\n");
      out.write("            type:'datetime'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function initCarData() {\r\n");
      out.write("            //渲染数据表格\r\n");
      out.write("            tableIns = table.render({\r\n");
      out.write("                elem: '#carTable'   //渲染的目标对象\r\n");
      out.write("                , url: '");
      out.print(path);
      out.write("/car/loadAllCar.action?isrenting=0' //数据接口\r\n");
      out.write("                , title: '车辆列表'//数据导出来的标题\r\n");
      out.write("                , height: 'full-150'\r\n");
      out.write("                , page: true  //是否启用分页\r\n");
      out.write("                , cols: [[   //列表数据\r\n");
      out.write("                    , {field: 'carnumber', title: '车牌号', align: 'center', width: '95'}\r\n");
      out.write("                    , {field: 'cartype', title: '出租类型', align: 'center', width: '90'}\r\n");
      out.write("                    , {field: 'color', title: '出租颜色', align: 'center', width: '90'}\r\n");
      out.write("                    , {field: 'price', title: '汽车价格', align: 'center', width: '90'}\r\n");
      out.write("                    , {field: 'rentprice', title: '出租价格', align: 'center', width: '90'}\r\n");
      out.write("                    , {field: 'deposit', title: '出租押金', align: 'center', width: '90'}\r\n");
      out.write("                    , {\r\n");
      out.write("                        field: 'isrenting', title: '出租状态', align: 'center', width: '90', templet: function (d) {\r\n");
      out.write("                            return d.isrenting == '1' ? '<font color=blue>已出租</font>' : '<font color=red>未出租</font>';\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    , {field: 'description', title: '出租描述', align: 'center', width: '150'}\r\n");
      out.write("                    , {\r\n");
      out.write("                        field: 'carimg', title: '缩略图', align: 'center', width: '80', templet: function (d) {\r\n");
      out.write("                            return \"<img width=40 height=40 src=");
      out.print(path);
      out.write("/file/downloadShowFile.action?path=\" + d.carimg + \"/>\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    , {field: 'createtime', title: '录入时间', align: 'center', width: '170'}\r\n");
      out.write("                    , {fixed: 'right', title: '操作', toolbar: '#carBar', align: 'center', width: '220'}\r\n");
      out.write("                ]]\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //模糊查询\r\n");
      out.write("        $(\"#doSearch\").click(function () {\r\n");
      out.write("            var params = $(\"#searchFrm\").serialize();\r\n");
      out.write("            $.post(\"");
      out.print(path);
      out.write("/rent/checkCustomerExist.action\", params, function (obj) {\r\n");
      out.write("                if (obj.code >= 0) { //此客户存在，code的返回值为0\r\n");
      out.write("                    $(\"#content\").show();\r\n");
      out.write("                    initCarData(); //初始化未出租汽车的所有数据\r\n");
      out.write("                } else {\r\n");
      out.write("                    layer.msg(\"客户身份证号不存在，请更正后在查询\");\r\n");
      out.write("                    //隐藏数据表格\r\n");
      out.write("                    $(\"#content\").hide();\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //监听行工具事件\r\n");
      out.write("        table.on('tool(carTable)', function (obj) {\r\n");
      out.write("            var data = obj.data; //获得当前行数据\r\n");
      out.write("            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）\r\n");
      out.write("            if (layEvent === 'rentCar') { //汽车出租\r\n");
      out.write("                //汽车出租，打开添加汽车出租页面\r\n");
      out.write("                openRentCar(data);\r\n");
      out.write("            } else if (layEvent === 'viewImage') { //查看大图\r\n");
      out.write("                showCarImage(data);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var mainIndex;\r\n");
      out.write("\r\n");
      out.write("        //打开添加页面\r\n");
      out.write("        function openRentCar(data) {\r\n");
      out.write("            mainIndex = layer.open({\r\n");
      out.write("                type: 1,\r\n");
      out.write("                title: '添加汽车出租',\r\n");
      out.write("                content: $(\"#saveOrUpdateDiv\"),\r\n");
      out.write("                area: ['690px', '380px'],\r\n");
      out.write("                success: function (index) {\r\n");
      out.write("                    //清空表单数据\r\n");
      out.write("                    $(\"#dataFrm\")[0].reset();\r\n");
      out.write("                    //请求数据,分别拿到出租价格，身份证号，车牌号\r\n");
      out.write("                    var price=data.rentprice;\r\n");
      out.write("                    var identity=$(\"#identity\").val();\r\n");
      out.write("                    var carnumber=data.carnumber;\r\n");
      out.write("                    $.get(\"");
      out.print(path);
      out.write("/rent/initRentFrom.action\",{\r\n");
      out.write("                        identity:identity,\r\n");
      out.write("                        price:price,\r\n");
      out.write("                        carnumber:carnumber\r\n");
      out.write("                    },function (obj) {\r\n");
      out.write("                        //赋值\r\n");
      out.write("                        form.val(\"dataFrm\",obj);\r\n");
      out.write("                    })\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //保存\r\n");
      out.write("        form.on(\"submit(doSubmit)\", function (obj) {\r\n");
      out.write("            //序列化表单数据\r\n");
      out.write("            var params = $(\"#dataFrm\").serialize();\r\n");
      out.write("            $.post(\"");
      out.print(path);
      out.write("/rent/saveRent.action\", params, function (obj) {\r\n");
      out.write("                layer.msg(obj.msg);\r\n");
      out.write("                //关闭弹出层\r\n");
      out.write("                layer.close(mainIndex);\r\n");
      out.write("                $(\"#content\").hide();\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //查看大图\r\n");
      out.write("        function showCarImage(data) {\r\n");
      out.write("            mainIndex = layer.open({\r\n");
      out.write("                type: 1,\r\n");
      out.write("                title: \"【\" + data.carnumber + '】的出租图片',\r\n");
      out.write("                content: $(\"#viewCarImageDiv\"),\r\n");
      out.write("                area: ['1100px', '550px'],\r\n");
      out.write("                success: function (index) {\r\n");
      out.write("                    $(\"#view_carimg\").attr(\"src\", \"");
      out.print(path);
      out.write("/file/downloadShowFile.action?path=\" + data.carimg);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}