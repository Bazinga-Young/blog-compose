import { createRouter, createWebHistory, RouteRecordRaw } from "vue-router";

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Login',
        component: () => import('../views/Login/login.vue') 
    },
    {
        path: '/todoItems',
        name: 'TodoItems',
        component: () => import('../views/TodoItems/TodoItems-index.vue') 
    },
]

const router = createRouter({
    history: createWebHistory(), // 路由模式：history模式
    routes: routes
})

export default router;