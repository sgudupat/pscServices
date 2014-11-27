package pscapp.services.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import pscapp.services.types.ContactInfo;

public class ContactsDaoImpl implements ContactsDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<ContactInfo> getContacts(String email, String password) {
        // TODO::
        try {
            String sql = "select * from contacts where email = ? ";
            //return this.jdbcTemplate.query(sql, new Object[]{email}, new ContactRowMapper());
            return null;
        } catch (Exception e) {
            System.out.println("email does not exists");
            return null;
        }

    }

    public boolean authenticateUserLogin(String email, String password) {
        boolean result = false;
        int count = -1;
        int count2 = -1;
        String validEmailPasswordQuery = "SELECT COUNT(*) FROM USERS WHERE email = ? AND password = ? ";
        String accountActiveQuery = "SELECT COUNT(*) FROM USERS WHERE email = ? AND status = 'ACTIVE' ";
        //QueryParameters params = new QueryParameters();
        //params.addParam(email);
        //params.addParam(password);

        return false;
    }
}
