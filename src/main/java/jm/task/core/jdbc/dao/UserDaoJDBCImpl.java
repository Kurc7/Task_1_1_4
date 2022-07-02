package jm.task.core.jdbc.dao;

public class UserDaoJDBCImpl { //implements UserDao
//    private static Connection connection;
//
//    static {
//        try {
//            connection = Util.util();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public UserDaoJDBCImpl() {
//
//    }
//
//    public void createUsersTable() {
//        try {
//            Statement stmt = connection.createStatement();
//
//            stmt.executeUpdate("CREATE TABLE `new_schema`.`User` (\n" +
//                    "  `id` BIGINT NOT NULL auto_increment,\n" +
//                    "  `name` VARCHAR(45) NOT NULL,\n" +
//                    "  `lastName` VARCHAR(45) NOT NULL,\n" +
//                    "  `age` TINYINT NOT NULL,\n" +
//                    "  PRIMARY KEY (`id`),\n" +
//                    "  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);");
//        } catch (SQLException e) {
//        }
//    }
//
//    public void dropUsersTable() {
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate("DROP TABLE `new_schema`.`User`;");
//        } catch (SQLException e) {
//        }
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        try {
//            PreparedStatement ptmt = connection.prepareStatement("INSERT INTO `new_schema`.`User` (name, lastName, age) values (?,?,?)");
//            ptmt.setString(1, name);
//            ptmt.setString(2, lastName);
//            ptmt.setByte(3, age);
//            ptmt.executeUpdate();
//            System.out.println(String.format("User с именем – %s добавлен в базу данных", name));
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void removeUserById(long id) {
//        try {
//            PreparedStatement ptmt = connection.prepareStatement("delete from `new_schema`.`User` where id = ?;");
//            ptmt.setLong(1, id);
//            ptmt.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public List<User> getAllUsers() {
//        List<User> list = new ArrayList<>();
//
//        try {
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `new_schema`.`user`;");
//            while (rs.next()) {
//                list.add(new User(rs.getString(2), rs.getString(3), rs.getByte(4)));
//            }
//            for(User u : list){
//                System.out.println(u.toString());
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return list;
//    }
//
//    public void cleanUsersTable() {
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate("TRUNCATE new_schema.user;");
//        } catch (SQLException e) {
//        }
//    }
}
