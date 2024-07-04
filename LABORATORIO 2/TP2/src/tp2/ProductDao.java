    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package tp2;

    /**
     *
     * @author Informatica7
     */

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;

    public class ProductDao {
        private final Connection connection = DBConnection.getConnection();
        private PreparedStatement preparedStatement;
        private ResultSet resultSet;
        private String query;

        //Listar todos los productos
        public List<Product> listAllProducts() {
            List<Product> products = new ArrayList<>();
            query = "SELECT * FROM products";
            try {
                preparedStatement = connection.prepareStatement(query);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    products.add(new Product(resultSet.getLong("idProduct"), resultSet.getString("name"),
                            resultSet.getDouble("price")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return products;
        }

       public Product findById(int id) {
    query = "SELECT * FROM products WHERE idproduct = ?";
    try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return new Product(resultSet.getLong("idproduct"), resultSet.getString("name"),
                    resultSet.getDouble("price"));
        }
    } catch (SQLException e) {
        e.printStackTrace();

    }
    return null; 
}

        public void save(Product product) {
            query = "INSERT INTO products (name, price) VALUES (?, ?)";
            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, product.getName());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.executeUpdate();
                System.out.println("Product saved");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    public void update(Product product) {
            query = "UPDATE products SET name = ?, price = ? WHERE idproduct = ?";
            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, product.getName());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setLong(3, product.getidProduct());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Product updated");
        }

        public void delete(Long id) {
            query = "DELETE FROM products WHERE idproduct = ?";
            try {
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setLong(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Product deleted");
        }
    }