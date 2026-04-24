import customtkinter as ctk

ctk.set_appearance_mode('dark')

janela = ctk.CTk()
janela.geometry('600x400')
janela.resizable(False, False)
janela.title('Sistema de Acesso')
janela.iconbitmap('01.ico')


#elemento de dentro da janela

titulo = ctk.CTkLabel(janela,
                      text='Sistema de Acesso',
                      text_color='red',
                      font=('Verdana', 40))
titulo.pack(pady=20)


login = ctk.CTkEntry(janela,
                     width=400,
                     height=40,
                     placeholder_text='Digite o seu login',
                     border_color='red')

login.pack()


senha = ctk.CTkEntry(janela,
                     width=400,
                     height=40,
                     placeholder_text='Digite a sua senha',
                     border_color='red',
                     show='*')

senha.pack(pady=20)


botao = ctk.CTkButton(janela,
                       text='Acessar',
                       width=150,
                       height=40,
                       font=('Verdana', 20),
                       fg_color='red',
                       text_color='black')
botao.pack(pady=20)























janela.mainloop()









