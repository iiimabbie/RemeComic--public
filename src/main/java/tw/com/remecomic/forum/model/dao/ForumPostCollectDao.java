package tw.com.remecomic.forum.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.com.remecomic.forum.model.bean.ForumPost;
import tw.com.remecomic.forum.model.bean.ForumPostCollect;
import tw.com.remecomic.forum.model.bean.ForumUser;

@Repository
public interface ForumPostCollectDao extends JpaRepository<ForumPostCollect,ForumUser> {
	
	public ForumPostCollect findByCollectedPostAndCollectFromUser(ForumPost post,ForumUser user);
}
