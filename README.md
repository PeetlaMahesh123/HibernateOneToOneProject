
# 🎓 Hibernate One-to-One Relationship  
## Student & Address Example

This project demonstrates a **One-to-One relationship** using Hibernate (JPA) between **Student** and **Address** entities.

---

## 📌 Project Overview

- One **Student** has one **Address**
- One **Address** belongs to one **Student**
- The relationship is mapped using a foreign key

---

## 🔹 Relationship Concept

Student (1)  --------  (1) Address

- One Student → One Address  
- One Address → One Student  

---

## 🛠 Technologies Used

- Java  
- Hibernate  
- JPA Annotations  
- MySQL  
- Maven  

---

## 🗄 Database Structure

### Student Table
- id (Primary Key)  
- name  
- email  

### Address Table
- id (Primary Key)  
- city  
- state  
- student_id (Foreign Key)  

---

## 🔁 Hibernate Mapping Concept

### One-To-One (Owning Side)

- Defined in either Student or Address entity  
- Uses `@OneToOne`
- Uses `@JoinColumn` to define foreign key  
- This side owns the relationship  

### Inverse Side (Optional)

- Uses `mappedBy` attribute  
- Not mandatory but recommended for bi-directional mapping  

---

## 🔑 Key Annotations Used

- `@Entity` → Marks class as entity  
- `@Table` → Maps entity to table  
- `@Id` → Primary key  
- `@GeneratedValue` → Auto ID generation  
- `@OneToOne` → Defines one-to-one relationship  
- `@JoinColumn` → Specifies foreign key column  

---

## ⚙ Fetch Strategies

- **EAGER** → Loads related entity immediately  
- **LAZY** → Loads related entity only when accessed  

(Default for OneToOne is EAGER)

---

## 🔁 Cascade Behavior (If Applied)

- CascadeType.PERSIST → Saves both Student and Address together  
- CascadeType.MERGE → Updates both entities  
- CascadeType.REMOVE → Deletes associated entity  

---

## 🎯 Expected Behavior

- Each student record is linked to exactly one address  
- Address cannot exist without its student (if cascade applied)  
- Foreign key ensures relationship integrity  

---

## ✅ Conclusion

This project explains:

- Hibernate One-to-One mapping  
- Owning and inverse side concepts  
- Foreign key handling  
- Fetch types (Lazy & Eager)  
- Cascade operations  

---

⭐ This example helps understand tightly coupled entity relationships in Hibernate.

