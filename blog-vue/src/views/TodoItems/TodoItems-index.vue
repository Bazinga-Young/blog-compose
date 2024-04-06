<script setup>
import { ref } from "vue";
const todoItems = ref([
  {
    timestamp: "Event start",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
  {
    timestamp: "Event doing",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
  {
    timestamp: "Event end",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
  {
    timestamp: "Event end",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
  {
    timestamp: "Event end",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
  {
    timestamp: "Event end",
    doSomething: "Update Github template",
    commitTime: "Tom committed 2018/4/12 20:46",
  },
]);
</script>

<template>
  <el-container>
    <el-header class="flex-center"> </el-header>
    <el-container>
      <el-main>
        <el-row :gutter="20">
          <el-col :span="8" :offset="8">
            <el-form>
              <el-input></el-input>
            </el-form>
          </el-col>
          <el-col :span="8">
            <el-button>search</el-button>
          </el-col>
        </el-row>
        <el-row :gutter="20" style="margin-top: 40px">
          <el-col :span="10" :offset="8">
            <el-scrollbar height="800px">
              <el-timeline style="max-width: 600px">
                <el-timeline-item
                  v-for="todoItem in todoItems"
                  :key="item"
                  :timestamp="todoItem.timestamp"
                  placement="top"
                >
                  <el-card>
                    <h4>{{ todoItem.doSomething }}</h4>
                    <p>{{ todoItem.commitTime }}</p>
                  </el-card>
                  <el-button>finish</el-button>
                  <el-button>add</el-button>
                  <el-button>delete</el-button>
                </el-timeline-item>
              </el-timeline>
            </el-scrollbar>
          </el-col>
        </el-row>
      </el-main>
    </el-container>
  </el-container>
</template>

<style>
.flex-center {
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
