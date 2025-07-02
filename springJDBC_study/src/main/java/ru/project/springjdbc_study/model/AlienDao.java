package ru.project.springjdbc_study.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Alien alien) {
        String query = "INSERT INTO alien (id, name, tech) VALUES (?,?,?)";
        jdbcTemplate.update(query, alien.getId(), alien.getName(), alien.getTech());
    }

    public List<Alien> findAll() {
        String sql = "select * from alien";

        return jdbcTemplate.query(sql, (rs, row) -> {
            Alien a  = new Alien();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setTech(rs.getString(3));
            return a;
        });
    }
}
