/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-17 15:11:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.business.check;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkCarManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>车辆入库管理</title>\r\n");
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
      out.write("            <label class=\"layui-form-label\">出租单号:</label>\r\n");
      out.write("            <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                <input type=\"text\" name=\"search_rentid\" id=\"search_rentid\" autocomplete=\"off\"\r\n");
      out.write("                       class=\"layui-input layui-input-inline\"\r\n");
      out.write("                       placeholder=\"请输入出租单号\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"button\"\r\n");
      out.write("                    class=\"layui-btn layui-btn-normal layui-icon layui-icon-search layui-btn-radius layui-btn-sm\"\r\n");
      out.write("                    id=\"doSearch\" style=\"margin-top: 4px\">查询\r\n");
      out.write("            </button>\r\n");
      out.write("            <button type=\"reset\"\r\n");
      out.write("                    class=\"layui-btn layui-btn-warm layui-icon layui-icon-refresh layui-btn-radius layui-btn-sm\"\r\n");
      out.write("                    style=\"margin-top: 4px\">重置\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\" style=\"display: none\">\r\n");
      out.write("    <blockquote class=\"layui-elem-quote\" style=\"margin-top: 10px\">\r\n");
      out.write("        <div id=\"test2\">\r\n");
      out.write("            检查单表单\r\n");
      out.write("        </div>\r\n");
      out.write("    </blockquote>\r\n");
      out.write("    <form class=\"layui-form\" method=\"post\" id=\"checkFrm\" lay-filter=\"checkFrm\">\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">检查单号:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"checkid\" readonly=\"readonly\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入检查单号\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">出租单号:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"rentid\" readonly=\"readonly\" autocomplete=\"off\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入出租单号\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">操作员:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"opername\" readonly=\"readonly\" autocomplete=\"off\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入操作员\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\">\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">存在问题:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"problem\" id=\"problem\" required  lay-verify=\"required\" autocomplete=\"off\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入存在的问题\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">赔付金额:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"paymoney\" id=\"paymoney\" required  lay-verify=\"required\" autocomplete=\"off\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入赔付金额\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-inline\">\r\n");
      out.write("                <label class=\"layui-form-label\">检查时间:</label>\r\n");
      out.write("                <div class=\"layui-input-inline\" style=\"padding: 5px;width: 280px\">\r\n");
      out.write("                    <input type=\"text\" name=\"checkdate\" id=\"checkdate\" required  lay-verify=\"required\"\r\n");
      out.write("                           class=\"layui-input layui-input-inline\"\r\n");
      out.write("                           placeholder=\"请输入检查时间\" style=\"height: 30px;border-radius: 10px;width: 280px\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item layui-form-text\">\r\n");
      out.write("            <label class=\"layui-form-label\">问题描述:</label>\r\n");
      out.write("            <div class=\"layui-input-block\">\r\n");
      out.write("                <textarea name=\"checkdesc\" placeholder=\"请输入问题描述\" required  lay-verify=\"required\" class=\"layui-textarea\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"layui-form-item\" style=\"text-align: center\">\r\n");
      out.write("            <button type=\"button\" lay-submit=\"\" lay-filter=\"doSubmit\"\r\n");
      out.write("                    class=\"layui-btn layui-btn-normal layui-icon layui-icon-release layui-btn-radius layui-btn-sm\"\r\n");
      out.write("                    id=\"doSubmit\" style=\"margin-top: 4px\">保存\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div style=\"padding: 10px; background-color: #F2F2F2;\">\r\n");
      out.write("        <div class=\"layui-row layui-col-space10\">\r\n");
      out.write("            <div class=\"layui-col-md4\">\r\n");
      out.write("                <div class=\"layui-card\">\r\n");
      out.write("                    <div class=\"layui-card-header\">车辆信息</div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_carnumber\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_cartype\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_color\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_price\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_rentprice\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_deposit\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"car_description\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\">\r\n");
      out.write("                        车辆图片：<img src=\"\" width=\"200\" height=\"150\" id=\"car_carimg\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-col-md4\">\r\n");
      out.write("                <div class=\"layui-card\">\r\n");
      out.write("                    <div class=\"layui-card-header\">出租单信息</div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"rent_rentid\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"rent_price\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"rent_begindate\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"rent_returndate\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"rent_opername\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-col-md4\">\r\n");
      out.write("                <div class=\"layui-card\">\r\n");
      out.write("                    <div class=\"layui-card-header\">客户信息</div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_identity\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_custname\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_sex\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_address\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_phone\"></div>\r\n");
      out.write("                    <div class=\"layui-card-body\" id=\"customer_career\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(path);
      out.write("/static/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    layui.use(['jquery', 'layer', 'form', 'table', 'laydate'], function () {\r\n");
      out.write("        var $ = layui.jquery;\r\n");
      out.write("        var layer = layui.layer;\r\n");
      out.write("        var form = layui.form;\r\n");
      out.write("        var table = layui.table;\r\n");
      out.write("        var dtree = layui.dtree;\r\n");
      out.write("        var laydate = layui.laydate;\r\n");
      out.write("\r\n");
      out.write("        //根据出租单号查询\r\n");
      out.write("        $(\"#doSearch\").click(function () {\r\n");
      out.write("            var rentid = $(\"#search_rentid\").val();\r\n");
      out.write("            $.post(\"");
      out.print(path);
      out.write("/check/checkRentExist.action\", {rentid: rentid}, function (obj) {\r\n");
      out.write("                if (obj === \"\") { //出租单号不存在，返回值为null\r\n");
      out.write("                    layer.msg(\"您输入的出租单号不存在，请更正后再查询\");\r\n");
      out.write("                    //隐藏数据表格\r\n");
      out.write("                    $(\"#content\").hide();\r\n");
      out.write("                } else {\r\n");
      out.write("                    if (obj.rentflag == 1) {\r\n");
      out.write("                        layer.msg(\"您输入的出租单号相关车辆已经归还，无需再入库\");\r\n");
      out.write("                        $(\"#content\").hide();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //初始化表单数据和卡片面板数据\r\n");
      out.write("                        initCheckFormData(rentid);\r\n");
      out.write("                        $(\"#content\").show();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //加载表单数据和 卡片面板数据\r\n");
      out.write("        function initCheckFormData(rentid) {\r\n");
      out.write("            $.post(\"");
      out.print(path);
      out.write("/check/initCheckFormData.action\",{rentid:rentid},function (obj) {\r\n");
      out.write("                //检查单\r\n");
      out.write("                var check=obj.check;\r\n");
      out.write("                form.val(\"checkFrm\",check);\r\n");
      out.write("\r\n");
      out.write("                //客户\r\n");
      out.write("                var customer=obj.customer;\r\n");
      out.write("                $(\"#customer_identity\").html(\"身份证号: \"+customer.identity);\r\n");
      out.write("                $(\"#customer_custname\").html(\"客户姓名: \"+customer.custname);\r\n");
      out.write("                $(\"#customer_sex\").html(\"客户性别: \"+(customer.sex==1?'男':'女'));\r\n");
      out.write("                $(\"#customer_address\").html(\"客户地址: \"+customer.address);\r\n");
      out.write("                $(\"#customer_phone\").html(\"客户电话: \"+customer.phone);\r\n");
      out.write("                $(\"#customer_career\").html(\"客户职位: \"+customer.career);\r\n");
      out.write("\r\n");
      out.write("                //出租单\r\n");
      out.write("                var rent=obj.rent;\r\n");
      out.write("\r\n");
      out.write("                $(\"#rent_rentid\").html(\"出租单号: \"+rent.rentid);\r\n");
      out.write("                $(\"#rent_price\").html(\"出租价格: \"+rent.price);\r\n");
      out.write("                $(\"#rent_begindate\").html(\"起租时间: \"+rent.begindate);\r\n");
      out.write("                $(\"#rent_returndate\").html(\"还车时间: \"+rent.returndate);\r\n");
      out.write("                $(\"#rent_opername\").html(\"操作员: \"+rent.opername);\r\n");
      out.write("\r\n");
      out.write("                //车辆信息\r\n");
      out.write("                var car=obj.car;\r\n");
      out.write("                $(\"#car_carnumber\").html(\"车辆号牌: \"+car.carnumber);\r\n");
      out.write("                $(\"#car_cartype\").html(\"车辆类型: \"+car.cartype);\r\n");
      out.write("                $(\"#car_color\").html(\"车辆颜色: \"+car.color);\r\n");
      out.write("                $(\"#car_price\").html(\"购买价格: \"+car.price);\r\n");
      out.write("                $(\"#car_rentprice\").html(\"出租价格: \"+car.rentprice);\r\n");
      out.write("                $(\"#car_deposit\").html(\"出租押金: \"+car.deposit);\r\n");
      out.write("                $(\"#car_description\").html(\"车辆描述: \"+car.description);\r\n");
      out.write("                $(\"#car_carimg\").attr(\"src\",\"");
      out.print(path);
      out.write("/file/downloadShowFile.action?path=\"+car.carimg);\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("        //保存\r\n");
      out.write("        form.on(\"submit(doSubmit)\",function () {\r\n");
      out.write("            var params = $(\"#checkFrm\").serialize();\r\n");
      out.write("            $.post(\"");
      out.print(path);
      out.write("/check/saveCheck.action\",params,function (obj) {\r\n");
      out.write("                layer.msg(obj.msg);\r\n");
      out.write("                $(\"#content\").hide();\r\n");
      out.write("            })\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
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
