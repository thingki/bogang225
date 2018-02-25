<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="test.Json"%>

<%
Json j = new Json();
j.setKey("test");
j.setMapList(new ArrayList<Map>());
List<Json> jList = new ArrayList<Json>();
jList.add(j);
Gson g = new Gson();
String jsonStr = g.toJson(jList);
out.println(jsonStr);
%>
