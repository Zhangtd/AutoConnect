package com.padeoe.nicservice.njuwlan.object.bras.row;

/**
 * 该类表示<a href="http://bras.nju.edu.cn">南京大学网络认证计费系统自助平台</a>中查询当前在线设备获得的在线设备列表中具体的一条(行)信息
 * 具体包括登陆区域，mac地址，登陆返回信息，用户名等大量信息
 * @author padeoe
 * Date: 2015/9/24
 */
public class OnlineRowBras
{
    protected String pvlan;

    protected String service_id;

    protected String area_id;

    protected String acctsessiontime;

    protected String mac;

    protected String service_name;

    protected String ap_id;

    protected String area_type;

    protected String id;

    protected String username;

    protected String acctstarttime;

    protected String area_name;

    protected String acctoutputoctets_ipv4;

    protected String user_ipv4;

    protected String fullname;

    protected String acctoutputoctets_ipv6;

    protected String user_ipv6;

    protected String acctinputoctets_ipv6;

    protected String acctinputoctets_ipv4;

    protected String subport;

    protected String acctsessionid;

    protected String svlan;

    protected String src_ip;

    protected String nas_ip;

    public String getPvlan ()
    {
        return pvlan;
    }

    public void setPvlan (String pvlan)
    {
        this.pvlan = pvlan;
    }

    public String getService_id ()
    {
        return service_id;
    }

    public void setService_id (String service_id)
    {
        this.service_id = service_id;
    }

    public String getArea_id ()
    {
        return area_id;
    }

    public void setArea_id (String area_id)
    {
        this.area_id = area_id;
    }

    public String getAcctsessiontime ()
    {
        return acctsessiontime;
    }

    public void setAcctsessiontime (String acctsessiontime)
    {
        this.acctsessiontime = acctsessiontime;
    }

    public String getMac ()
    {
        return mac;
    }

    public void setMac (String mac)
    {
        this.mac = mac;
    }

    public String getService_name ()
    {
        return service_name;
    }

    public void setService_name (String service_name)
    {
        this.service_name = service_name;
    }

    public String getAp_id ()
    {
        return ap_id;
    }

    public void setAp_id (String ap_id)
    {
        this.ap_id = ap_id;
    }

    public String getArea_type ()
    {
        return area_type;
    }

    public void setArea_type (String area_type)
    {
        this.area_type = area_type;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getAcctstarttime ()
    {
        return acctstarttime;
    }

    public void setAcctstarttime (String acctstarttime)
    {
        this.acctstarttime = acctstarttime;
    }

    public String getArea_name ()
    {
        return area_name;
    }

    public void setArea_name (String area_name)
    {
        this.area_name = area_name;
    }

    public String getAcctoutputoctets_ipv4 ()
    {
        return acctoutputoctets_ipv4;
    }

    public void setAcctoutputoctets_ipv4 (String acctoutputoctets_ipv4)
    {
        this.acctoutputoctets_ipv4 = acctoutputoctets_ipv4;
    }

    public String getUser_ipv4 ()
    {
        return user_ipv4;
    }

    public void setUser_ipv4 (String user_ipv4)
    {
        this.user_ipv4 = user_ipv4;
    }

    public String getFullname ()
    {
        return fullname;
    }

    public void setFullname (String fullname)
    {
        this.fullname = fullname;
    }

    public String getAcctoutputoctets_ipv6 ()
    {
        return acctoutputoctets_ipv6;
    }

    public void setAcctoutputoctets_ipv6 (String acctoutputoctets_ipv6)
    {
        this.acctoutputoctets_ipv6 = acctoutputoctets_ipv6;
    }

    public String getUser_ipv6 ()
    {
        return user_ipv6;
    }

    public void setUser_ipv6 (String user_ipv6)
    {
        this.user_ipv6 = user_ipv6;
    }

    public String getAcctinputoctets_ipv6 ()
    {
        return acctinputoctets_ipv6;
    }

    public void setAcctinputoctets_ipv6 (String acctinputoctets_ipv6)
    {
        this.acctinputoctets_ipv6 = acctinputoctets_ipv6;
    }

    public String getAcctinputoctets_ipv4 ()
    {
        return acctinputoctets_ipv4;
    }

    public void setAcctinputoctets_ipv4 (String acctinputoctets_ipv4)
    {
        this.acctinputoctets_ipv4 = acctinputoctets_ipv4;
    }

    public String getSubport ()
    {
        return subport;
    }

    public void setSubport (String subport)
    {
        this.subport = subport;
    }

    public String getAcctsessionid ()
    {
        return acctsessionid;
    }

    public void setAcctsessionid (String acctsessionid)
    {
        this.acctsessionid = acctsessionid;
    }

    public String getSvlan ()
    {
        return svlan;
    }

    public void setSvlan (String svlan)
    {
        this.svlan = svlan;
    }

    public String getSrc_ip ()
    {
        return src_ip;
    }

    public void setSrc_ip (String src_ip)
    {
        this.src_ip = src_ip;
    }

    public String getNas_ip ()
    {
        return nas_ip;
    }

    public void setNas_ip (String nas_ip)
    {
        this.nas_ip = nas_ip;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pvlan = "+pvlan+", service_id = "+service_id+", area_id = "+area_id+", acctsessiontime = "+acctsessiontime+", mac = "+mac+", service_name = "+service_name+", ap_id = "+ap_id+", area_type = "+area_type+", id = "+id+", username = "+username+", acctstarttime = "+acctstarttime+", area_name = "+area_name+", acctoutputoctets_ipv4 = "+acctoutputoctets_ipv4+", user_ipv4 = "+user_ipv4+", fullname = "+fullname+", acctoutputoctets_ipv6 = "+acctoutputoctets_ipv6+", user_ipv6 = "+user_ipv6+", acctinputoctets_ipv6 = "+acctinputoctets_ipv6+", acctinputoctets_ipv4 = "+acctinputoctets_ipv4+", subport = "+subport+", acctsessionid = "+acctsessionid+", svlan = "+svlan+", src_ip = "+src_ip+", nas_ip = "+nas_ip+"]";
    }
}


