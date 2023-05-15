import request from '@/utils/request'

// 查询教师管理列表
export function listTeachers3(query) {
  return request({
    url: '/jx3/teachers3/list',
    method: 'get',
    params: query
  })
}

// 查询教师管理详细
export function getTeachers3(tno) {
  return request({
    url: '/jx3/teachers3/' + tno,
    method: 'get'
  })
}

// 新增教师管理
export function addTeachers3(data) {
  return request({
    url: '/jx3/teachers3',
    method: 'post',
    data: data
  })
}

// 修改教师管理
export function updateTeachers3(data) {
  return request({
    url: '/jx3/teachers3',
    method: 'put',
    data: data
  })
}

// 删除教师管理
export function delTeachers3(tno) {
  return request({
    url: '/jx3/teachers3/' + tno,
    method: 'delete'
  })
}
