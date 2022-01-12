package co.zoan.chat.presentation.chat

import co.zoan.chat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
