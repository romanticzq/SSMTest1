package online.qsx.service;

import com.github.pagehelper.PageInfo;

import online.qsx.model.StudentModel;

public interface StudentServer {

	//查询并返回分页信息
	PageInfo<StudentModel> getStudents(StudentModel studentModel,int pageNum,int pageSize);
	//添加
	void addStudent(StudentModel studentModel);
	//删除
	void deleteStudent(int key);
	//修改
	void updateStudent(StudentModel studentModel);
	//查看详细信息
	StudentModel getStudent(int key);
}
