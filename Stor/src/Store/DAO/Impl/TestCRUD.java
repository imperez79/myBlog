package Store.DAO.Impl;



import java.util.ArrayList;

import Store.Domain.Category;
import Store.Domain.SubCategory;
import Store.Domain.User;

public class TestCRUD {

	public static void main(String[] args) {
		UserDAOImpl crud = new UserDAOImpl();
		
		   User newuser = new User();
		   newuser.setName("petr");
		   newuser.setPassword("petr");
		   newuser.setEmail("petr@pter.ru");
		   newuser.setTmpPassword("tmpPetr");
		   newuser.setIdRole(1);
		   System.out.println("Создали " + newuser);
		   crud.insert(newuser);
		   System.out.println("Вставили");
		   User nuser = crud.getUserByNameAndPassword("petr","petr");
		   System.out.println(nuser);
		   crud.getById(nuser.getId());
		   System.out.println("Получили по id");
		   crud.edit(newuser);
		   System.out.println("Изменили");
		   crud.delete(nuser);
		   System.out.println("Удалили");
		   ArrayList<User> list = crud.getAll();
		   for(User u : list) {
			   System.out.println(u.getName());
		   }
		   System.out.println("Получили все " + list.size() + " записи");
		   
		   SubCategoryImpl crudSub = new SubCategoryImpl();
			
		   SubCategory newSub = new SubCategory();
		   newSub.setName("petr");
		   newSub.setId_category(3);
		   System.out.println("Создали " + newSub);
		   crudSub.insert(newSub);
		   System.out.println("Вставили");
		   SubCategory nSub = crudSub.getById(newSub.getId());
		   System.out.println(nSub);
		   System.out.println("Получили по id");
		   crudSub.edit(nSub);
		   System.out.println("Изменили");
		   crudSub.delete(nSub);
		   System.out.println("Удалили");
		   ArrayList<SubCategory> listSub = crudSub.getAll();
		   for(SubCategory s : listSub) {
			   System.out.println(s.getName());
		   }
		   System.out.println("Получили все " + listSub.size() + " записи");
		   
		   
		   CategoryImpl crudCat = new  CategoryImpl();
			
		   Category newCat = new Category();
		   newCat.setName("petr");
		   System.out.println("Создали " + newCat);
		   crudCat.insert(newCat);
		   System.out.println("Вставили");
		   Category nCat = crudCat.getCategoryByName(newCat.getName());
		   System.out.println(nCat);
		   System.out.println("Получили  id" +nCat.getId());
		   crudCat.edit(nCat);
		   System.out.println("Изменили");
		   crudCat.delete(nCat);
		   System.out.println("Удалили");
		   ArrayList<Category> listCat = crudCat.getAll();
		   for(Category c : listCat) {
			   System.out.println(c.getName());
		   }
		   System.out.println("Получили все " + listSub.size() + " записи");
		   
	}

}
