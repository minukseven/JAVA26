package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionFactory;

public class MemberOracleDao implements MemberDao {
    
    private ConnectionFactory factory = new ConnectionFactory();

    @Override
    public boolean save(Member m) {
        String sql = "INSERT INTO bank_member (id, password, name, email, mobile, type) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = factory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPassword());
            pstmt.setString(3, m.getName());
            pstmt.setString(4, m.getEmail());
            pstmt.setString(5, m.getMobile()); 
            // char 타입을 DB에 넣기 위해 String으로 변환
            pstmt.setString(6, String.valueOf(m.getType())); 
            
            int result = pstmt.executeUpdate();
            return result > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Member> findAll() {
        List<Member> list = new ArrayList<>();
        String sql = "SELECT * FROM bank_member";
        
        try (Connection conn = factory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                // DB에서 가져온 문자열의 첫 글자를 char 타입으로 추출
                char memberType = rs.getString("type").charAt(0);
                
                Member m = new Member(
                    rs.getString("id"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("mobile"),
                    memberType // 추출한 char 값을 그대로 전달
                );
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list.isEmpty() ? null : list;
    }

    @Override
    public Member findById(String id) {
        String sql = "SELECT * FROM bank_member WHERE id = ?";
        
        try (Connection conn = factory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, id); 
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // DB에서 가져온 문자열의 첫 글자를 char 타입으로 추출
                    char memberType = rs.getString("type").charAt(0);
                    
                    return new Member(
                        rs.getString("id"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("mobile"),
                        memberType // 추출한 char 값을 그대로 전달
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Member m) {
        String sql = "UPDATE bank_member SET password = ?, name = ?, email = ?, mobile = ?, type = ? WHERE id = ?";
        
        try (Connection conn = factory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, m.getPassword());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getEmail());
            pstmt.setString(4, m.getMobile());
            // char 타입을 DB에 넣기 위해 String으로 변환
            pstmt.setString(5, String.valueOf(m.getType()));
            pstmt.setString(6, m.getId());
            
            int result = pstmt.executeUpdate();
            return result > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Member m) {
        String sql = "DELETE FROM bank_member WHERE id = ?";
        
        try (Connection conn = factory.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, m.getId());
            
            int result = pstmt.executeUpdate();
            return result > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}