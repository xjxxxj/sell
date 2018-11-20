<!DOCTYPE html>
<html lang="zh">
<#include "../common/header.ftl">
<body>

<div id="main-wrapper">
    <#include "../common/sidebar.ftl">

    <#include "../common/topbar.ftl">

    <!-- 页面主体内容 -->
    <!-- Page wrapper  -->
    <div class="page-wrapper">

        <!-- 页面功能导航 -->
        <div class="page-breadcrumb">
            <div class="row">
                <div class="col-5 align-self-center">
                    <h4 class="page-title">订单管理</h4>
                    <div class="d-flex align-items-center"></div>
                </div>
                <div class="col-7 align-self-center">
                    <div class="d-flex no-block justify-content-end align-items-center">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item">首页</li>
                                <li class="breadcrumb-item active" aria-current="page">
                                    订单
                                </li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>

        <!-- 页面主体信息 -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">订单列表</h4>
                            <div class="table-responsive">
                                <table id="zero_config" class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th class="text-center">订单ID</th>
                                        <th class="text-center">姓名</th>
                                        <th class="text-center">手机号</th>
                                        <th class="text-center">地址</th>
                                        <th class="text-center">金额</th>
                                        <th class="text-center">订单状态</th>
                                        <th class="text-center">支付状态</th>
                                        <th class="text-center">创建时间</th>
                                        <th class="text-center">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                                <!-- 分页 -->
                                <ul class="pagination float-right">

                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<#include "../common/layout.ftl">

<#include "../common/js.ftl">
</body>
</html>