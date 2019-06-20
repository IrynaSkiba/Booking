package itechart.booking.service.impl;

import itechart.booking.model.Tariff;
import itechart.booking.repository.TariffRepository;
import itechart.booking.service.TariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffServiceImpl implements TariffService {
    @Autowired
    private TariffRepository tariffRepository;

    @Override
    public Tariff getTariffById(Long id) {
        return tariffRepository.getById(id);
    }
}
