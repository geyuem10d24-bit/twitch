package com.laioffer.twitch.db;

// imports...

import com.laioffer.twitch.db.entity.ItemEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface ItemRepository extends ListCrudRepository<ItemEntity, Long> {

    // SELECT * FROM items WHERE twitch_id = ? // ? is twitchId
    ItemEntity findByTwitchId(String twitchId);
}
