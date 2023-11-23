
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OfficeWorkStatusManager from "./components/listers/OfficeWorkStatusCards"
import OfficeWorkStatusDetail from "./components/listers/OfficeWorkStatusDetail"

import HomeHomeStatusManager from "./components/listers/HomeHomeStatusCards"
import HomeHomeStatusDetail from "./components/listers/HomeHomeStatusDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/offices/workStatuses',
                name: 'OfficeWorkStatusManager',
                component: OfficeWorkStatusManager
            },
            {
                path: '/offices/workStatuses/:id',
                name: 'OfficeWorkStatusDetail',
                component: OfficeWorkStatusDetail
            },

            {
                path: '/homes/homeStatuses',
                name: 'HomeHomeStatusManager',
                component: HomeHomeStatusManager
            },
            {
                path: '/homes/homeStatuses/:id',
                name: 'HomeHomeStatusDetail',
                component: HomeHomeStatusDetail
            },



    ]
})
