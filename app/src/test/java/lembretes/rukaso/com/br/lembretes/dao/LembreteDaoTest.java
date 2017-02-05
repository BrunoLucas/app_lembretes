package lembretes.rukaso.com.br.lembretes.dao;

import org.junit.Test;

import static org.junit.Assert.*;

import android.content.Context;
import android.test.ServiceTestCase;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import lembretes.rukaso.com.br.lembretes.model.Lembrete;

import static org.junit.Assert.*;

/**
 * Created by lucas on 05/02/17.
 */
public class LembreteDaoTest {

    private Lembrete lembrete;
    private LembreteDao lembreteDao;

    @Before
    public void setUp() throws Exception {
        lembrete = new Lembrete();
        lembrete.setTitulo("Titulo");
        lembrete.setDescricao("Descricao");
    }


    @Test
    public void inserirLembrete() throws Exception {

        lembreteDao = new LembreteDao(getTestContext());
        assertTrue(lembreteDao.inserirLembrete(lembrete));

    }


    private Context getTestContext()
    {
        try
        {
            Method getTestContext = ServiceTestCase.class.getMethod("getTestContext");
            return (Context) getTestContext.invoke(this);
        }
        catch (final Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
}