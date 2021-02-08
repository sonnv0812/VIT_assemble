package com.example.vit.ui.main.home;

import com.example.vit.R;
import com.example.vit.config.UserType;
import com.example.vit.data.model.ItemCardHome;

import java.util.ArrayList;
import java.util.List;

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void getInitUI(int userType) {
        List<ItemCardHome> items = new ArrayList<>();
        items.add(new ItemCardHome(R.drawable.ic_check_box,
                "Hoạt động",
                "Đăng ký hoặc xem các hoạt động đã diễn ra"));
        items.add(new ItemCardHome(R.drawable.ic_insights,
                "Điểm hoạt động",
                "Điểm hoạt động của bản thân trong kỳ qua"));

        switch (userType) {
            case UserType.ADMIN :
                items.add(new ItemCardHome(R.drawable.ic_add_active,
                        "Thêm hoạt động",
                        "Thêm chương trình sắp diễn ra"));
                break;
            case UserType.MEMBER:
                break;
        }

        view.updateInitUI(items);
    }

}
