package com.amc.ebg.ws.operations;

import static org.testng.Assert.*;
import ch.swissbytes.commons.test.JPAUnitTest;
import java.util.Date;
import java.util.List;

import org.testng.annotations.Test;

import com.amc.ebg.domain.dto.CategoryId;

import com.amc.ebg.domain.types.GenderType;


/**
 * @author Timoteo Ponce
 */
public class GetCategoryListActionTest extends JPAUnitTest {

    //private GetCategoryListAction action = new GetCategoryListAction(getPersister());

   // private final UserToken clientToken = UserToken.of("clientToken" + System.currentTimeMillis());

 //   @BeforeClass
//    public void beforeClass() {
//        Consumer consumer = new Consumer(GenderType.MALE.id(), "name", "lastName", "email", clientToken.toString(), true, new Date());
//        persist(consumer);
//    }
//
//    //@Test
////    public void testListSubCategories() {
////        CategoryListType listType = action.execute(clientToken, CategoryId.of(1));
////        List<CategoryType> categoryListType = listType.getCategoryList();
////        assertEquals(categoryListType.size(), 3);
////        assertEntries(categoryListType);
////    }
//
//   // @Test
//    public void testListLevelOne() {
//        CategoryListType listType = action.execute(clientToken, CategoryId.NULL, 1, false);
//        List<CategoryType> categoryListType = listType.getCategoryList();
//        assertEquals(categoryListType.size(), 17);
//        assertEntries(categoryListType);
//    }
//
//    @Test
//    public void testListLevelOneSubscribed() throws Exception {
//        clearData(CategorySubscription.class);
//        //
//        new SubscribeCategoryAction(getPersister()).execute(clientToken, 6, 7);
//        CategoryListType listType = action.execute(clientToken, true);
//        List<CategoryType> categoryListType = listType.getCategoryList();
//        assertEquals(categoryListType.size(), 2);
//    }
//
//    @Test
//    public void testListSubscribedSubCategories() throws Exception {
//        clearData(CategorySubscription.class);
//        Category subcategory = createSubcategory(3);
//        //
//        SubscribeCategoryAction subscribeAction = new SubscribeCategoryAction(getPersister());
//        subscribeAction.execute(clientToken, 2);
//        subscribeAction.execute(clientToken, subcategory.getId().intValue());
//        CategoryListType listType = action.execute(clientToken, CategoryId.of(1), true);
//        List<CategoryType> categoryListType = listType.getCategoryList();
//        assertEquals(categoryListType.size(), 2);
//    }
//
//    private Category createSubcategory(final long parentId) {
//        Category category = new Category();
//        category.setDescription("description");
//        category.setIsLeaf(true);
//        category.setLevel(2);
//        category.setName("name");
//        category.setParent(getPersister().find(Category.class, parentId));
//        category.setStatus(StatusEnum.ACTIVE.getEntity(getPersister()));
//        persist(category);
//        return category;
//    }
//
//    private void assertEntries(final List<CategoryType> categoryList) {
//        for (CategoryType categoryType : categoryList) {
//            assertNotNull(categoryType.getDescription());
//            assertNotNull(categoryType.getId());
//            assertNotNull(categoryType.getName());
//            assertNotNull(categoryType.getLevel());
//            assertNotNull(categoryType.getParentId());
//        }
//    }
//
//    @Test
//    public void testCategoryListWithAnInvalidToken() {
//        CategoryListType listType = action.execute(UserToken.of("invalidToken"), false);
//        assertNull(listType);
//    }

}
