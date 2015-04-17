/**
 * 项目名称: FansBookShopping
 * 版本号：1.0
 * 名字：雷文
 * QQ：240-370-818
 * 邮箱: LeiWen@FansUnion.cn
 * 
 * 小雷网: http://FansUnion.cn
 * CSDN:http://blog.csdn.net/FansUnion
 * 版权所有: 2011-2013,leiwen
 */
package cn.fansunion.bookshopping.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 书
 * 
 * @author 雷文 2011-11-10
 * @since 1.0
 */
public class Book {
	/**
	 * 书的ID
	 */
	private Integer bookId;
	/**
	 * 书的分类
	 */
	private BookCategory bookCategory;

	private Set<OrderItem> orderItems = new HashSet<OrderItem>();

	private Set<BookComment> bookComments = new HashSet<BookComment>();
	/**
	 * 书的名字
	 */
	private String name;
	/**
	 * 当前价格
	 */
	private Float currentPrice;
	/**
	 * 定价
	 */
	private Float fullPrice;
	/**
	 * 描述信息
	 */
	private String description;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 出版社
	 */
	private String press;
	/**
	 * 出版日期
	 */
	private Date pressDate;
	/**
	 * 国际图书编号
	 */
	private Long isbn;
	/**
	 * 库存
	 */
	private Long stock;
	/**
	 * 书的图片
	 */
	private String image;

	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * @param bookId
	 *            the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the bookCategory
	 */
	public BookCategory getBookCategory() {
		return bookCategory;
	}

	/**
	 * @param bookCategory
	 *            the bookCategory to set
	 */
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the currentPrice
	 */
	public Float getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @param currentPrice
	 *            the currentPrice to set
	 */
	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}

	/**
	 * @return the fullPrice
	 */
	public Float getFullPrice() {
		return fullPrice;
	}

	/**
	 * @param fullPrice
	 *            the fullPrice to set
	 */
	public void setFullPrice(Float fullPrice) {
		this.fullPrice = fullPrice;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the press
	 */
	public String getPress() {
		return press;
	}

	/**
	 * @param press
	 *            the press to set
	 */
	public void setPress(String press) {
		this.press = press;
	}

	/**
	 * @return the pressDate
	 */
	public Date getPressDate() {
		return pressDate;
	}

	/**
	 * @param pressDate
	 *            the pressDate to set
	 */
	public void setPressDate(Date pressDate) {
		this.pressDate = pressDate;
	}

	/**
	 * @return the isbn
	 */
	public Long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the stock
	 */
	public Long getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(Long stock) {
		this.stock = stock;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the orderItems
	 */
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems
	 *            the orderItems to set
	 */
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return the bookComments
	 */
	public Set<BookComment> getBookComments() {
		return bookComments;
	}

	/**
	 * @param bookComments
	 *            the bookComments to set
	 */
	public void setBookComments(Set<BookComment> bookComments) {
		this.bookComments = bookComments;
	}

	@Override
	public boolean equals(Object object) {
		if(object == null){
			return false;
		}
		
		if(object == this){
			return true;
		}
		
		Book b = (Book)object;
		if(bookId.equals(b.getBookId())){
			return true;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return bookId.hashCode() + author.hashCode() + name.hashCode()
				+ press.hashCode();

	}

	@Override
	public String toString() {
		return "bookId:" + bookId + ",name:" + name + ",author:" + author
				+ ",press:" + press;

	}
}
