<template>
  <div>
    <el-container>
      <!--aside-->
      <el-aside :width="asideWidth" style="min-height: 100vh; background-color: #001529">
        <div style="height:60px; color: white; display:flex; align-items: center; justify-content:center">
          <img src="@/assets/logo1.png" alt="" style="width:40px; height:40px">
          <span class="logo-title" v-show="!isCollapse">PocketTrack</span>
        </div>

        <el-menu :collapse="isCollapse" :collapse-transition="false" router background-color="#001529"
                 text-color="rgba(255,255,255,0.65)" active-text-color="#fff" style="border:none"
                 :default-active="$route.path">
          <el-menu-item index="/">
            <i class="el-icon-house"></i>
            <span slot="title">Dashboard</span>
          </el-menu-item>
          <el-menu-item index="/element">
            <i class="el-icon-money"></i>
            <span slot="title">Transactions</span>
          </el-menu-item>
          <el-menu-item>
            <i class="el-icon-s-marketing"></i>
            <span slot="title">SavingGoals</span>
          </el-menu-item>
          <el-menu-item>
            <i class="el-icon-bank-card"></i>
            <span slot="title">Budgets</span>
          </el-menu-item>
          <el-submenu>
            <template slot="title">
              <i class="el-icon-s-management"></i>
              <span>System Mgmt</span>
            </template>
            <el-menu-item>
              <template slot="title">
                <i class="el-icon-user"></i>
                <span>User Info</span>
              </template>
            </el-menu-item>
            <el-menu-item>
              <template slot="title">
                <i class="el-icon-s-custom"></i>
                <span>Admin Info</span>
              </template>
            </el-menu-item>
          </el-submenu>
        </el-menu>

      </el-aside>
      <el-container>
        <!--header-->
        <el-header>
          <i :class="collapseIcon" style="font-size: 26px " @click="handleCollapse"></i>
          <el-breadcrumb separator-class="el-icon-arrow-right" style="margin-left: 20px">
            <el-breadcrumb-item :to="{ path: '/' }">Dashboard</el-breadcrumb-item>
          </el-breadcrumb>
          <div style="flex:1; width:0;display: flex; align-items: center; justify-content: flex-end">
            <i class="el-icon-quanping" style="font-size: 26px" @click="handleFull"></i>
            <el-dropdown placement="bottom">
              <div style="display: flex; align-items: center; cursor:default">
                <img src="@/assets/logo1.png" alt="" style="width: 40px; height: 40px; margin: 0 5px">
                <span>Admin</span>
              </div>
              <el-dropdown-menu slot="dropdown">
                <el-dropdown-item @click="">Personal Info</el-dropdown-item>
                <el-dropdown-item @clicl="">Change Password</el-dropdown-item>
                <el-dropdown-item @click="">Logout</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </div>
        </el-header>
        <!--body-->
        <el-main>
          <div style="box-shadow:0 0 10px rgba(0,0,0,.1);padding: 10px 20px; border-racdius:5px; margin-bottom:10px">
            Hello, Everyone！
          </div>
          <el-card style="width:500px">
            <div slot="header" class="clearfix">
              <span>Welcome to Pockettrack system!</span>
            </div>
            <div>
              Nice to explore it!
              <div style="margin-top: 20px">
                <div style="margin:10px 0"><strong>Themes</strong></div>
                <el-button type="primary">button</el-button>
                <el-button type="success">button</el-button>
                <el-button type="warning">button</el-button>
                <el-button type="danger">button</el-button>
                <el-button type="info">button</el-button>
              </div>
            </div>
          </el-card>
        </el-main>
      </el-container>

    </el-container>
  </div>
</template>

<script>
export default {
  name: 'HomeView',
  data() {
    return {
      isCollapse: false,  //expand
      asideWidth: '200px',
      collapseIcon: 'el-icon-s-fold'
    }
  },
  methods: {
    handleFull() {
      document.documentElement.requestFullscreen();
    },
    handleCollapse() {
      this.isCollapse = !this.isCollapse
      this.asideWidth = this.isCollapse ? '64px' : '200px'
      this.collapseIcon = this.isCollapse ? 'el-icon-s-unfold' : 'el-icon-s-fold'
    }
  }
}
</script>

<style>
.el-menu--inline {
  background-color: #000c17 !important;
}

.el-menu--inline .el-menu-item {
  background-color: #000c17 !important;
  padding-left: 24px !important;
}

.el-menu-item:hover, .el-submenu__title:hover {
  color: #fff !important;
}

.el-submenu__title:hover i {
  color: #fff !important;
}

.el-menu-item.is-active {
  background-color: #1890ff !important;
  border-radius: 5px !important;
  width: calc(100% - 8px);
  margin-left: 4px;
}

.el-menu-item.is-active i, .el-menu-item.is-active .el-tooltip {
  margin-left: -4px;
}

.el-menu-item {
  height: 40px !important;
  line-height: 40px !important;
}

.el-submenu__title {
  height: 40px !important;
  line-height: 40px !important;
}

.el-submenu .el-menu-item {
  min-width: 0 !important;
}

.el-menu--inline .el-menu-item.is-active {
  padding-left: 24px !important;
}

/*.el-submenu__icon-arrow {
  margin-top: -5px;
}*/

.el-aside {
  transition: width .3s;
  box-shadow: 2px 0 6px rgba(0, 21, 41, .35);
}

.logo-title {
  margin-left: 5px;
  font-size: 20px;
  transition: all .3s; /*0.3s*/
}

.el-header {
  box-shadow: 2px 0 6px rgba(0, 21, 41, .35);
  display: flex;
  align-items: center;
}
</style>