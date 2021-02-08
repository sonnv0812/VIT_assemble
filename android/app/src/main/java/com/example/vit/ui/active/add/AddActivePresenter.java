package com.example.vit.ui.active.add;

import com.example.vit.data.repository.active.add.AddActiveRepository;

public class AddActivePresenter implements AddActiveContract.Presenter {
    private AddActiveContract.View view;
    private AddActiveRepository repository;

    public AddActivePresenter(AddActiveContract.View view, AddActiveRepository repository) {
        this.view = view;
        this.repository = repository;
    }
}
