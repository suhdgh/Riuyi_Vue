import request from '@/utils/request'

// 查询课程管理列表
export function listCourse3(query) {
  return request({
    url: '/jx3/course3/list',
    method: 'get',
    params: query
  })
}

// 查询课程管理详细
export function getCourse3(cno) {
  return request({
    url: '/jx3/course3/' + cno,
    method: 'get'
  })
}

// 新增课程管理
export function addCourse3(data) {
  return request({
    url: '/jx3/course3',
    method: 'post',
    data: data
  })
}

// 修改课程管理
export function updateCourse3(data) {
  return request({
    url: '/jx3/course3',
    method: 'put',
    data: data
  })
}

// 删除课程管理
export function delCourse3(cno) {
  return request({
    url: '/jx3/course3/' + cno,
    method: 'delete'
  })
}
