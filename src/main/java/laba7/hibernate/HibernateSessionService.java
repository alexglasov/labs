package laba7.hibernate;

import laba7.dao.EntityManagerGroupDao;
import laba7.dao.EntityManagerStudentDao;
import laba7.dao.GroupDao;
import laba7.dao.StudentDao;
import laba7.entity.Group;
import laba7.entity.Student;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateSessionService {
    private final GroupDao groupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new EntityManagerGroupDao(sessionFactory);
    }

    public void exec() {
        Student student = studentDao.findById(1L);
        System.out.println(student);


        List<Student> students = studentDao.findAll();
        System.out.println(students);

        Group group = groupDao.findById(1L);

        Student newStudent = new Student();
        newStudent.setName("Иван");
        newStudent.setSurname("Новый");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}
