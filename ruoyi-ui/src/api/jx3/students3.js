import request from '@/utils/request'

// 查询学生管理列表
export function listStudents3(query) {
  return request({
    url: '/jx3/students3/list',
    method: 'get',
    params: query
  })
}

// 查询学生管理详细
export function getStudents3(sno) {
  return request({
    url: '/jx3/students3/' + sno,
    method: 'get'
  })
}

// 新增学生管理
export function addStudents3(data) {
  return request({
    url: '/jx3/students3',
    method: 'post',
    data: data
  })
}

// 修改学生管理
export function updateStudents3(data) {
  return request({
    url: '/jx3/students3',
    method: 'put',
    data: data
  })
}

// 删除学生管理
export function delStudents3(sno) {
  return request({
    url: '/jx3/students3/' + sno,
    method: 'delete'
  })
}
